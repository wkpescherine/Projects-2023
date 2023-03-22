import React , { FC } from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { Stocks } from "./components"

const App : FC = () => {
    const navigation = useNavigation();

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicCatTitle}>Stock Market Section</Text>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}>Cash: $0</Text>
                    <Text style={mainStyle.basicText}>Bank: $0</Text>
                    <Text style={mainStyle.basicText}>Invested: $0</Text>
                </View>
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Apple</Text>
                    <Text style={mainStyle.basicText}> Open: $34</Text>
                    <Text style={mainStyle.basicText}> Closed: $37</Text>
                    <Text style={mainStyle.basicText}> Chng: +1%</Text>
                    <Button title="+"/>
                    <Button title="-"/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Google</Text>
                    <Text style={mainStyle.basicText}> Open: $55</Text>
                    <Text style={mainStyle.basicText}> Closed: $62</Text>
                    <Text style={mainStyle.basicText}> Chng: +1.4%</Text>
                    <Button title="+"/>
                    <Button title="-"/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Tesla</Text>
                    <Text style={mainStyle.basicText}> Open: $24</Text>
                    <Text style={mainStyle.basicText}> Closed: $22</Text>
                    <Text style={mainStyle.basicText}> Chng: -1%</Text>
                    <Button title="+"/>
                    <Button title="-"/>
                </View>
                <View style={mainStyle.spacer} />
                <Text style={mainStyle.basicText}>Stock Portfolio</Text>

                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;