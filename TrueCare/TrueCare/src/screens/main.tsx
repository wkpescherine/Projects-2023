import React , { FC } from "react";
import { View , Text, Button} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View>
            <Text>This is the main page</Text>
            <Button title="Home" onPress={()=> navigation.navigate("home")}/>
            <Button title="Create Account" onPress={()=>navigation.navigate("create")}/>
            <Button title="Log-In" onPress={()=>navigation.navigate("login")}/>
        </View>
    )
}

export default App;