import React , { FC , useState} from "react";
import { View , Text, Button , Image } from "react-native";
import mainStyle from "../../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { CCPayments } from "./";

const App : FC = () => {
    const [ficoScore , steFicoScore] = useState(600)

    const [visaStatus, setVisaStatus] = useState("Apply")
    const [visaLimit, setVisaLimit] = useState("1000")
    const [visaInterest, setVisaInterest] = useState("19.8")
    const [visaBalance, setVisaBalance] = useState("0")
    const [visaAvailable, setVisaAvailable] = useState("0")

    const upgradeCC = (card:string) =>{
        if(card === "visa" && ficoScore >= 600){ setVisaStatus("Basic")}
        if(card === "visa" && visaStatus=== "Basic" &&ficoScore >= 700){ setVisaStatus("Basic")}
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.spacer} />
                {/* This section is for the Visa CC */}
                {visaStatus === "Apply" &&
                    <View>
                        <Button title="Basic Visa Apply" onPress={() => upgradeCC("visa")}/>
                    </View>
                }
                {visaStatus ==="Basic" &&
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
                        <Button title="Apply to upgrade to Platnium" />
                    </View>
                }
                {visaStatus !== "Apply" &&
                    <CCPayments />
                }
                {visaStatus === "Basic" &&
                    <View>
                        <Button title="Apply to Upgrade to Platnium" onPress={() => upgradeCC("visa")}/>
                    </View>
                }
        </>
    )
}

export default App;