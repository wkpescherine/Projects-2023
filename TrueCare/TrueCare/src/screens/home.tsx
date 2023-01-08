import React , { FC } from "react";
import { View , Text, Button} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <View>
            <Text>Welcome to TrueCare</Text>
            <Button title="Log-Out" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;