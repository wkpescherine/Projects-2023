import React , { FC } from "react";
import { View , Text, Button, StyleSheet } from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <Text>TrueCare</Text>
            <Button title="Create Account" onPress={()=>navigation.navigate("create")}/>
            <Button title="Log-In" onPress={()=>navigation.navigate("login")}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        justifyContent: "center",
        alignItems: "center",
    }
})

export default App;