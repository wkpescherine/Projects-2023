import React , { FC , useEffect , useState} from "react";
import { View , Text, Button , Image, TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import AsyncStorage from "@react-native-async-storage/async-storage";

const App : FC = () => {
    const navigation = useNavigation();

    const [chaseDeposit, setChaseDeposit] = useState(0)
    const [boaDeposit, setBoADeposit] = useState(0)
    const [cashOnHand,setCashOnHand] = useState(0)

    const depositIntoAccount = (bank, amount) => {
        if(amount <= cashOnHand){
            if(bank ==="boa"){saveData()}
            if(bank="chase"){saveData()}
        }else{
            alert("The amoutn you have entered is greater then cash on hand")
            if(bank==="boa"){setBoADeposit(cashOnHand)}
            if(bank==="chase"){setChaseDeposit(cashOnHand)}
        }
    }


    const saveData = async() =>{
        try{
            await AsyncStorage.setItem('cashOnHand', cashOnHand );
            await AsyncStorage.setItem('chaseAccount', chaseDeposit );
            await AsyncStorage.setItem('boaAccount', boaDeposit );
        }catch (e) {
            alert("Failed")
        }
    }

    const getData = async() =>{
        try{
            const value1 = await AsyncStorage.getItem('cashOnHand')
            const value2 = await AsyncStorage.getItem('chaseAccount')
            const value3 = await AsyncStorage.getItem('boaAccount')
            setCashOnHand(value1)
            setChaseDeposit(value2)
            setBoADeposit(value3)
        }catch (e) {
            console.log(e)
        }
    }

    useEffect(()=>{
        getData()
    },[])

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Banking</Text>
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/chasebank.png")} style={{width: 120, height: 120}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}> Chase </Text>
                            <Text style={mainStyle.basicText}> ${chaseDeposit}</Text>
                        </View>
                        <View>
                           <TextInput                             
                                style={mainStyle.inputTextStyle}
                                onChangeText={text=>setChaseDeposit(text)}
                                value={chaseDeposit}
                                keyboardType= {"number-pad"}
                            ></TextInput>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Button title="Withdrawal" />
                                <View style={{padding:5}}></View>
                                <Button title="Deposit" />
                            </View>
                        </View>
                    </View>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/bankofAmerica.png")} style={{width: 120, height: 120}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}> Bank of America</Text>
                            <Text style={mainStyle.basicText}> ${boaDeposit}</Text>
                        </View>
                        <View>
                           <TextInput                             
                                style={mainStyle.inputTextStyle}
                                onChangeText={text=>setBoADeposit(text)}
                                value={boaDeposit}
                                keyboardType= {"number-pad"}
                            ></TextInput>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Button title="Withdrawal" />
                                <View style={{padding:5}}></View>
                                <Button title="Deposit" onPress={()=> depositIntoAccount("boa", boaDeposit)}/>
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