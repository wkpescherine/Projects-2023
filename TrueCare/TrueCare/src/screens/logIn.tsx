import React , { FC } from "react";
import { View , Text, TextInput, Button} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View>
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