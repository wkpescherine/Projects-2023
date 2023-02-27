import React , { FC , useState} from "react";
import { View , Text, Button } from "react-native";
import { useNavigation } from "@react-navigation/native";
import mainStyle from "../../stylesheets/mainStyleSheet"
import { StatusBar } from "expo-status-bar";

const App : FC = () => {
    const navigation = useNavigation();

    const [state, setState] = useState("");
    const [locationValue , setLocationValue] = useState(0);

    const statesUSA = ["AK","AL","AZ","CO","CT","DE","FL","GA","HI","KA","KY","LA","MO","MN","NE","NJ","NM","NY","OK","OR","PA","RI","SC","SD","TN","TX","UT","VA","VT","WA",];

    const nextState = () => {
        setLocationValue(locationValue+1)
        setState(statesUSA[locationValue])
    }

    const prevState = () => {
        setLocationValue(locationValue-1)
        setState(statesUSA[locationValue])
    }

    return(
        <><StatusBar hidden />
            <View style={mainStyle.horizonFlow}>
                <Button title="<" onPress={() => prevState()}/>
                <Text style={mainStyle.basicText}>{state}</Text>
                <Button title=">" onPress={() => nextState()}/>
            </View>
        </>
    )
}

export default App;