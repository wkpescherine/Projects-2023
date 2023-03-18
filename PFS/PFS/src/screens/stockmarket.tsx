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
                <Text style={mainStyle.basicCatTitle}>Stock Market Section</Text>
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Text> Apple</Text>
                    <Text> 34</Text>
                    <Text> 36</Text>
                    <Text> Apple</Text>
                    <Button title="+"/>
                    <Button title="-"/>
                </View>
                <View style={mainStyle.spacer} />

                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;