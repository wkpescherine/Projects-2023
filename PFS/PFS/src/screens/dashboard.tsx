import React , { FC , useState} from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { Stocks } from "./components"
import AsyncStorage from "@react-native-async-storage/async-storage"

const App : FC = () => {
    const navigation = useNavigation();

    const [name,setName] = useState("")

    const getData = async() =>{
        try{
            const value = await AsyncStorage.getItem('username')
            setName(value);
        }catch (e) {
            //alert("dashboard Failed")
        }
    }

    getData()

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicText}>Dashboard</Text>
                <Text style={mainStyle.basicText}>{name}</Text>
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