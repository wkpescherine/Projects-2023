import React , { FC, useState } from "react";
import { View , Text, Button , Image} from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";
import { CCPayments } from "./components";

const App : FC = () => {
    const navigation = useNavigation();

    const [ficoScore , steFicoScore] = useState(600)

    //VISA DATA
    const [visaStatus, setVisaStatus] = useState("Apply")
    const [visaLimit, setVisaLimit] = useState("1000")
    const [visaInterest, setVisaInterest] = useState("19.8")
    const [visaBalance, setVisaBalance] = useState("0")
    const [visaAvailable, setVisaAvailable] = useState("0")
    //MASTERCARD DATA
    const [mastercardStatus, setMastercardStatus] = useState("Apply")
    const [mastercardLimit, setMastercardLimit] = useState("1000")
    const [mastercardInterest, setMastercardInterest] = useState("19.8")
    const [mastercardBalance, setMastercardBalance] = useState("0")
    const [mastercardAvailable, setMastercardAvailable] = useState("0")
    //AMEX DATA
    const [amexStatus, setAmexStatus] = useState("Apply")
    const [amexcardLimit, setAmexLimit] = useState("1000")
    const [amexcardInterest, setAmexInterest] = useState("19.8")
    const [amexcardBalance, setAmexBalance] = useState("0")
    const [amexAvailable, setAmexAvailable] = useState("0")

    const upgradeCC = (card:string) =>{
        if(card === "visa" && ficoScore >= 600){ setVisaStatus("Basic")}
        if(card === "visa" && visaStatus=== "Basic" &&ficoScore >= 700){ setVisaStatus("Basic")}
        if(card === "mastercard" && ficoScore >= 600){ setVisaStatus("Basic")}
        if(card === "mastercard" && mastercardStatus=== "Basic" &&ficoScore >= 700){ setVisaStatus("Basic")}
        if(card === "amex" && ficoScore >= 600){ setVisaStatus("Basic")}
        if(card === "amex" && amexStatus=== "Basic" &&ficoScore >= 700){ setVisaStatus("Basic")}
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.container}>
                <Text style={mainStyle.basicTitle}>Credit Cards</Text>
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
                <View style={mainStyle.spacer} />
                {/* This section is for the Mastercard CC */}
                {mastercardStatus === "Apply" &&
                    <View>
                        <Button title="Basic Mastercard Apply" />
                    </View>
                }
                {mastercardStatus ==="Basic" &&
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
                                    <Text style={mainStyle.basicText}>Available: S  {visaAvailable}%</Text>
                                 </View>
                            </View>
                        </View>
                    </View>
                }
                {mastercardStatus === "Basic" &&
                    <CCPayments />
                }
                {mastercardStatus === "Basic" &&
                    <View>
                        <Button title="Apply to Upgrade to Platnium" onPress={() => upgradeCC("mastercard")}/>
                    </View>
                }

                <View style={mainStyle.spacer} />
                {/* This section is for the AMEX CC */}
                <View>
                    <Button title="Basic Amex Apply" />
                </View>
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
                <View>
                    <Text>Fico Score: {ficoScore}</Text>
                </View>
                <View style={mainStyle.spacer} />
                <Button title="Back to Dashboard" onPress={() => navigation.navigate("dashboard")}/>
            </View>
        </>
    )
}

export default App;