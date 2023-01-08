import React , { FC } from "react";
import { View , Text , Button , TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View>
            <Text>Username</Text>
            <TextInput
                placeholder="Enter username" 
            />
            <Text>Password</Text>
            <TextInput
                placeholder="Enter password" 
            />
            <Button title="Create Account" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;