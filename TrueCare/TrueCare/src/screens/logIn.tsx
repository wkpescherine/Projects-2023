import React , { FC } from "react";
import { View , TextInput , Button , StyleSheet } from "react-native";
import { useNavigation } from "@react-navigation/native";
import styles from "../Stylesheets/containers"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <TextInput
                placeholder="Enter username" 
            />
            <TextInput
                placeholder="Enter password" 
            />
            <Button title="Log-In" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;