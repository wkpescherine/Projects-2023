import React , { FC } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
import containers from "../Stylesheets/containers"
import texts from "../Stylesheets/texts"
import { StatusBar } from "expo-status-bar";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <>
        <StatusBar hidden />
            <View style={containers.container}>
                <Text style={texts.basicTitle}>TrueCare</Text>
                <View style={containers.horizontal}>
                    <Button title="Create Account" onPress={() => navigation.navigate("create")} />
                </View>
                <View style={containers.horizontal}>
                    <Button title="Log-In" onPress={() => navigation.navigate("login")} />
                </View>
            </View>
        </>
    )
}

export default App;