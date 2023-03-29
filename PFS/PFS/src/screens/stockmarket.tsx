import React , { FC , useState } from "react";
import { View , Text, Button } from "react-native";
import { useIsFocused , useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
//import { Stocks } from "./components"

const App : FC = () => {
    const navigation = useNavigation()
    const isFocused = useIsFocused()

    const appleStockValues = [0,0,0]
    const googleStockValues = [0,0,0]
    const [appleProfileValues, setAppleProfileValues] = useState(appleStockValues)
    const [googleProfileValues, setGoogleProfileValues] = useState(googleStockValues)

    function buyStock(purchase:string){
        if(purchase === "Apple"){
            console.log(appleStockValues[0])
            let temp = appleStockValues[0]
            let temp2 = temp+1 
            appleStockValues[0] = temp2
            console.log(appleStockValues[0])
            setAppleProfileValues(appleStockValues)
            console.log("here")
            console.log(typeof(appleStockValues[0]))
            console.log(appleProfileValues[0])
            console.log(appleProfileValues)
        }
    }

    return(
        <><StatusBar hidden />
            {isFocused ? console.log("On Stock") : console.log("Left Stock")}
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
                    <Button title="BUY" onPress={() => buyStock("Apple")}/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Google</Text>
                    <Text style={mainStyle.basicText}> Open: $55</Text>
                    <Text style={mainStyle.basicText}> Closed: $62</Text>
                    <Text style={mainStyle.basicText}> Chng: +1.4%</Text>
                    <Button title="BUY"/>
                </View>
                <View style={mainStyle.horizonFlow}>
                    <Text style={mainStyle.basicText}> Tesla</Text>
                    <Text style={mainStyle.basicText}> Open: $24</Text>
                    <Text style={mainStyle.basicText}> Closed: $22</Text>
                    <Text style={mainStyle.basicText}> Chng: -1%</Text>
                    <Button title="BUY"/>
                </View>
                <View style={mainStyle.spacer} />
                <Text style={mainStyle.basicText}>Stock Portfolio</Text>
                <View>
                    <View style={mainStyle.horizonFlow}>
                        {appleProfileValues[0] !== 0 &&
                            <View>
                                <Text style={mainStyle.basicText}>Apple : {appleProfileValues[0]}</Text>
                                <Button title="SELL" />
                            </View>
                        }   
                    </View>
                </View>
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;