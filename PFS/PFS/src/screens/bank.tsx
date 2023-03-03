import React , { FC , useEffect , useState} from "react";
import { View , Text, Button , Image, TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import AsyncStorage from "@react-native-async-storage/async-storage";

const App : FC = () => {
    const navigation = useNavigation();
    
    const [cashOnHand,setCashOnHand] = useState("")
    const [chaseTotal, setChaseTotal] = useState("0")
    const [chaseAmount,setChaseAmount] = useState(0)
    const [boaTotal, setBoATotal] = useState("0")
    const [boaAmount,setBoAAmount] = useState(0)

    const getData = async() =>{
        try{
            const value1 = await AsyncStorage.getItem('cashOnHand')
            const value2 = await AsyncStorage.getItem('chaseAccount')
            const value3 = await AsyncStorage.getItem('boaAccount')
            setCashOnHand(value1)
            setChaseTotal(value2)
            setBoATotal(value3)
            console.log(value1)
        }catch (e) {
            console.log(e)
        }
    }

    useEffect(()=>{
        getData()
    },[])

    const depositIntoAccount = (bank:string, amount:number) => {
        let cash = Number(cashOnHand)
        if(amount <= cash){
            if(bank ==="boa"){setBoATotal(boaTotal+amount);saveData()}
            if(bank ==="chase"){setChaseTotal(chaseTotal+amount);saveData()}
            setBoAAmount(0)
            setChaseAmount(0)
            setCashOnHand((cash-Number(boaAmount)-Number(chaseAmount)).toString())
        }else{
            alert("The amount you have entered is greater then cash on hand")
            if(bank==="boa"){setBoAAmount(Number(cashOnHand))}
            if(bank==="chase"){
                setChaseAmount(cash)
            }
        }
    }

    //const withdrawFromAccount = (bank, amount) =>{
    //    if(bank === "boa"){
    //        if(boaAmount <= boaValue){
    //            setCashOnHand(cashOnHand-boaAmount)
    //            setBoAValue(boaValue-boaAmount)
    //            setBoAAmount(0)
    //        }else{
    //            alert("The withdrawl amount is greater then amount in account")
    //            setBoAAmount(boaValue)
    //        }
    //    }
    //}


    const saveData = async() =>{
        
        try{
            await AsyncStorage.setItem('cashOnHand', cashOnHand );
            await AsyncStorage.setItem('chaseAccount', chaseAmount.toString() );
            await AsyncStorage.setItem('boaAccount', boaAmount.toString() );
        }catch (e) {
            alert("Failed")
        }
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Banking</Text>
                <Text style={mainStyle.basicText}>${cashOnHand}</Text>
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/chasebank.png")} style={{width: 120, height: 120}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}> Chase </Text>
                            <Text style={mainStyle.basicText}> ${chaseTotal}</Text>
                        </View>
                        <View>
                           <TextInput                             
                                style={mainStyle.inputTextStyle}
                                onChangeText={text=>setChaseAmount(text)}
                                maxLength={6}
                                value={chaseAmount}
                                keyboardType= {"number-pad"}
                            ></TextInput>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Button title="Withdrawal" />
                                <View style={{padding:5}}></View>
                                <Button title="Deposit" onPress={()=>depositIntoAccount("chase", chaseAmount)}/>
                            </View>
                        </View>
                    </View>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/bankofAmerica.png")} style={{width: 120, height: 120}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}> Bank of America</Text>
                            <Text style={mainStyle.basicText}> ${boaTotal}</Text>
                        </View>
                        <View>
                           <TextInput                             
                                style={mainStyle.inputTextStyle}
                                onChangeText={text=>setBoAAmount(text)}
                                maxLength={6}
                                value={boaAmount}
                                keyboardType= {"number-pad"}
                            ></TextInput>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Button title="Withdrawal" />
                                <View style={{padding:5}}></View>
                                <Button title="Deposit" onPress={()=> depositIntoAccount("boa", boaAmount)}/>
                            </View>
                        </View>
                    </View>
                </View>
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;