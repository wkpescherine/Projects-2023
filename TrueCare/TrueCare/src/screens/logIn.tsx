import React , { FC } from "react";
import { View , Text, TextInput} from "react-native";

const App : FC = () => {
    return(
        <View>
            <TextInput
                placeholder="Enter username" 
            />
            <TextInput
                placeholder="Enter password" 
            />
        </View>
    )
}

export default App;