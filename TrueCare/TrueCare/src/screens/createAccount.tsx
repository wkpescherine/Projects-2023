import React , { FC, useState } from "react";
import { View , Text , Button , TextInput, StyleSheet} from "react-native";
import { useNavigation } from "@react-navigation/native";
import styles from "../Stylesheets/containers"

const App : FC = () => {
    const navigation = useNavigation();
    const [client,setClient] = useState("Patient");
    const [rate,setRate] = useState("Slow");
    const [cost, setCost] = useState(0);

    function handleClient(){
        if(client==="Patient"){
            setClient("Medical")
        }else{
            setClient("Patient")
        }
    }

    function handleRate(){
        if(rate === "Slow"){
            setRate("Normal")
        }else if (rate === "Normal"){
            setRate("Increased")
        }else if (rate === "Increased"){
            setRate("Rapid")
        }else{
            setRate("Slow")
        }
    }

    return(
        <View style={styles.container}>
            <Text>Username</Text>
            <TextInput
                placeholder="Enter username" 
            />
            <Text>Password</Text>
            <TextInput
                placeholder="Enter password" 
            />
            <Button onPress={()=>handleClient()} title={client} />
            <View>
                <Text>Rate : </Text>
                <Button title={rate} onPress={()=>handleRate()} />
            </View>
            <View>
                <Text>Cost: ${cost}</Text>
            </View>
            <Button title="Create Account" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;