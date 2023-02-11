import React , { FC, useState } from "react";
import { View , Text, Button, TextInput } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
//import texts from "../Stylesheets/texts"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import localStorage from "../localStorage/localStorage"

const App : FC = () => {
    const navigation = useNavigation();

    const [username, setUserName] = useState("")
    const [password,setPassword] = useState("")

    function validAccount(){
        if(username ==="test" && password ==="test"){
            navigation.navigate("dashboard")
            setUserName("")
            setPassword("")
            localStorage(username)   
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
            </View>
        </>
    )
}

export default App;