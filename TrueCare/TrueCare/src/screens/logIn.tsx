import React , { FC } from "react";
import { View , TextInput , Button , StyleSheet } from "react-native";
import { useNavigation } from "@react-navigation/native";
import container from "../Stylesheets/containers"
import texts from "../Stylesheets/texts"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={container.container}>
            <View style={container.horizonFlow}>

            </View>
            <TextInput style={container.inputContainer}
                placeholder="Username" 
            />
            <TextInput style={container.inputContainer}
                placeholder="Password" 
            />
            <Button title="Log-In" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;