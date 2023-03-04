import React , { FC, useState } from "react";
import { View , Text, Button , Image} from "react-native";
import { useNavigation } from "@react-navigation/native";
//import containers from "../Stylesheets/containers"
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { CCPayments } from "./components";

const App : FC = () => {
    const navigation = useNavigation();

    const [visaLimit, setVisaLimit] = useState(1000)
    const [visaInterest, setVisaInterest] = useState(2.1)
    const [visaBalance, setVisaBalance] = useState(0)
    const [visaAvailable, setVisaAvailable] = useState(0)

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Credit Cards</Text>
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/visaCC.png")} style={{width: 90, height: 60}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Limit: ${visaLimit}</Text>
                            <Text style={mainStyle.basicText}>Interest: {visaInterest}%</Text>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Balance: ${visaBalance}</Text>
                                <Text style={mainStyle.basicText}>Available: S{visaAvailable}%</Text>
                            </View>
                        </View>
                    </View>
                </View>
                <CCPayments />
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/mastercardCC.png")} style={{width: 90, height: 60}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Limit: ${visaLimit}</Text>
                            <Text style={mainStyle.basicText}>Interest: {visaInterest}%</Text>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Balance: ${visaBalance}</Text>
                                <Text style={mainStyle.basicText}>Available: S{visaAvailable}%</Text>
                            </View>
                        </View>
                    </View>
                </View>
                <CCPayments />
                <View style={mainStyle.spacer} />
                <View style={mainStyle.spacer} />
                <View style={mainStyle.horizonFlow}>
                    <Image source={require("../images/amex.png")} style={{width: 90, height: 60}} />
                    <View>
                        <View style={mainStyle.horizonFlow}>
                            <Text style={mainStyle.basicText}>Limit: ${visaLimit}</Text>
                            <Text style={mainStyle.basicText}>Interest: {visaInterest}%</Text>
                        </View>
                        <View>
                            <View style={mainStyle.horizonFlow}>
                                <Text style={mainStyle.basicText}>Balance: ${visaBalance}</Text>
                                <Text style={mainStyle.basicText}>Available: S{visaAvailable}%</Text>
                            </View>
                        </View>
                    </View>
                </View>
                <CCPayments />
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;