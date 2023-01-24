import React , { FC } from "react";
import { View , Text, Button , StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <Text>Welcome to TrueCare</Text>
            <Button title="Log-Out" onPress={()=>navigation.navigate("main")}/>
            <Button title="Profile" onPress={()=>navigation.navigate("profile")}/>
        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        flex: 1,
        justifyContent: "center",
        alignItems: "center",
    }
})

export default App;