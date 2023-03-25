import React , { FC } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../../stylesheets/mainStyleSheet"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <><StatusBar hidden />
            <View style={mainStyle.horizonFlow}>
                <Text style={mainStyle.basicText}>Account Profile</Text>
                <Button title=">" onPress={() => navigation.navigate("dailytasks")}/>
            </View>
        </>
    )
}

export default App;