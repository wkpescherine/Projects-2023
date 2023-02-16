import React , { FC , useEffect, useState} from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { Stocks , Bank } from "./components"
import AsyncStorage from "@react-native-async-storage/async-storage"

const App : FC = () => {
    const navigation = useNavigation();

    const [name,setName] = useState("")

    const getData = async () => {
        try{
            const value = await AsyncStorage.getItem('username')
            if( value !== null){
                setName(value);
            }else {
                alert("Value was null")
            }
        }catch (e) {
            //alert("dashboard Failed")
        }
    }

    useEffect(() =>{
        getData();
    },[]);

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicText}>Dashboard</Text>
                <Text style={mainStyle.basicText}>{name}</Text>
                <View style={mainStyle.spacer} />
                <Bank />
                <View style={mainStyle.spacer} />
                <Stocks />
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <View style={{padding: 5,}}>
                        <Button title="Logout" onPress={() => navigation.navigate("main")}/>
                    </View>
                    <Button title="Setting" onPress={() => navigation.navigate("settings")}/>
                </View>
            </View>
        </>
    )
}

export default App;