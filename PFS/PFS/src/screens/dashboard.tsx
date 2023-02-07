import React , { FC } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <><StatusBar hidden />
            <View>
                <Text style={mainStyle.basicText}>Dashboard</Text>
                <Button title="Logout" onPress={() => navigation.navigate("main")}/>
            </View>
        </>
    )
}

export default App;