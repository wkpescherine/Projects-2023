import React , { FC } from "react";
import { View , Text, Button, StyleSheet } from "react-native";
import { useNavigation } from "@react-navigation/native";
import styles from "../Stylesheets/containers"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <Text style={styles.horizontalText} >TrueCare</Text>
            <View style={styles.horizontal}>
                <Button title="Create Account" onPress={()=>navigation.navigate("create")}/>
            </View>
            <View style={styles.horizontal}>
                <Button title="Log-In" onPress={()=>navigation.navigate("login")}/>
            </View>
        </View>
    )
}

export default App;