import React , { FC } from "react";
import { View , Text, Button, TextInput } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
//import texts from "../Stylesheets/texts"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Personal</Text>
                <Text style={mainStyle.basicTitle}>Finance</Text>
                <Text style={mainStyle.basicTitle}>Simulator</Text>
                <TextInput placeholder="Username" />
                <TextInput placeholder="password" />
                <Button title="Start" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;