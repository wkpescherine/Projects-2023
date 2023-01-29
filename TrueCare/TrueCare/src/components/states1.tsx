import React , { FC } from "react";
import { View , Text, Button , StyleSheet} from "react-native";
import containers from "../Stylesheets/containers"

const App : FC = () => {
    return(
        <View style={containers.horizonFlow}>
            <View style={containers.containerButton}>
                <Button title="AK"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="AL"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="AR"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="AZ"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="CT"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="DE"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="MA"/>
            </View>
            <View style={containers.containerButton}>
                <Button title="NH"/>
            </View>
        </View>
    )
}

export default App;