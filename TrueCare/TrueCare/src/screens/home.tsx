import React , { FC } from "react";
import { View , Text, Button , StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <Text>Welcome to TrueCare</Text>
            <Button title="Log-Out" onPress={()=>navigation.navigate("main")}/>
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