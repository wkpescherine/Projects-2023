import React , { FC } from "react";
import { View , Text, TextInput} from "react-native";

const App : FC = () => {
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
        </View>
    )
}

export default App;