import React , { FC } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { Stocks } from "./components"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicText}>Dashboard</Text>
                <Text style={mainStyle.basicText}>Username</Text>
                <View style={mainStyle.spacer} />
                <Stocks />
                <View style={mainStyle.spacer} />
                <Button title="Logout" onPress={() => navigation.navigate("main")}/>
            </View>
        </>
    )
}

export default App;