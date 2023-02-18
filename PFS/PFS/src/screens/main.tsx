import React , { FC, useState , useEffect } from "react";
import { View , Text, Button, TextInput } from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import AsyncStorage from "@react-native-async-storage/async-storage"

const App : FC = () => {
    const navigation = useNavigation();

    const [username,setUserName] = useState("")
    const [password,setPassword] = useState("")
    const [account,setAccount] = useState("None")

    const checkAccount = async () => {
        try{
            const value = await AsyncStorage.getItem('username')
            if( value !== null){
                setAccount("Active");
            }else {
                setAccount("Non-Active")
            }
        }catch (e) {
            console.log(e)
        }
    }

    useEffect(() =>{
        checkAccount();
    },[]);


    const saveData = async(value) =>{
        try{
            console.log("was here")
            await AsyncStorage.setItem('username', value);
            console.log("This is after the data should be saved")
        }catch (e) {
            alert("Failed")
        }
    }

    function validAccount(){
        if(username ==="test" && password ==="test"){
            saveData(username)
            setUserName("")
            setPassword("")
            navigation.navigate("dashboard")
        }else{
            setUserName("")
            setPassword("")
        }
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Personal</Text>
                <Text style={mainStyle.basicTitle}>Finance</Text>
                <Text style={mainStyle.basicTitle}>Simulator</Text>
                <TextInput 
                    style={mainStyle.inputTextStyle}
                    placeholder="Username" 
                    onChangeText={text=>setUserName(text)}
                    value={username}
                    />
                <TextInput 
                    style={mainStyle.inputTextStyle}
                    placeholder="password" 
                    onChangeText={text=>setPassword(text)}
                    value={password}/>
                <Button title="Start" onPress={() => validAccount()}/>
                {account ==="Non-Active" &&
                    <View>
                        <Button title="Create Account"/>
                    </View>
                }
            </View>
        </>
    )
}

export default App;