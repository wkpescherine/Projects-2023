import React , { FC, useState } from "react";
import { View , Text , Button , TextInput} from "react-native";
import { useNavigation } from "@react-navigation/native";

const App : FC = () => {
    const navigation = useNavigation();
    const [client,setClient] = useState("Patient");
    const [rate,setRate] = useState("Monthly");

    const handleClient = () => {
        if(client==="Patient"){
            setClient("Medical")
        }else{
            setClient("Patient")
        }
    }

    const handleRate = () => {
        if(rate === "Monthly"){
            setRate("Quarterly")
        }else if (rate === "Quarterly"){
            setRate("Semi-Annually")
        }
    }

    return(
        <View>
            <Text>Username</Text>
            <TextInput
                placeholder="Enter username" 
            />
            <Text>Password</Text>
            <TextInput
                placeholder="Enter password" 
            />
            <Button onPress={()=>handleClient} title={client} />
            <View>
                <Text>Rate :</Text>
                <Button title={rate} />
            </View>
            <Button title="Create Account" onPress={()=>navigation.navigate("home")}/>
            <Button title="Back" onPress={()=>navigation.navigate("main")}/>
        </View>
    )
}

export default App;