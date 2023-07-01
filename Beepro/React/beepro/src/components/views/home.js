import React, {useState} from 'react';

import Beepro from "./beepro"
import School from "./school"

function Main (){
    const [storeType, setStoreType] = useState("home")
    const [section, setSection] = useState("home")
    return (
        <div>
            {
                storeType === "home" &&
                <Beepro />
            }
            {
                section ==="home" &&
                <div style={{backgroundColor:"#555555", padding: 1}}>
                    <input></input>
                    <button>Find</button>
                </div>
            }
            {
                storeType === "school" &&
                <School />
            }
        </div>
    );
}

export default  Main;