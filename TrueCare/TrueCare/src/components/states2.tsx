import React , { FC } from "react";
import { View , Text, Button , StyleSheet} from "react-native";
import containers from "../Stylesheets/containers"

const App : FC = () => {
    return(
        <View style={containers.horizonFlow}>
             <View style={containers.containerButton}>
                <Button title="NC"/>
            </View>
             <View style={containers.containerButton}>
                <Button title="NJ"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="NY"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="PA"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="SC"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="VA"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="VT"/>
            </View>
        </View>
    )
}

export default App;