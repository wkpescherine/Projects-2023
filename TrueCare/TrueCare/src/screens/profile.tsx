import React , { FC } from "react";
import { View , Text, Button , StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View style={styles.container}>
            <Text>UserName </Text>
            <Button title="Back to Main" onPress={()=>navigation.navigate("home")}/>
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