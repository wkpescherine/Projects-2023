import React, {useState} from 'react';

import Beepro from "./beepro"
import School from "./school"
import Navbar from '../components/navbar';

function Main (){
    const [storeType, setStoreType] = useState("home")
    const [section, setSection] = useState("home")
    const [school, setSchool] = useState("")

    const handleSectionCallback = (data) => {
        setStoreType("home")
        setSection(data)
    }

    const handleSchoolCallback = (data2) => {
        //setSchool(data2)
        setSection("home")
        setStoreType("school")
    }

    const handleSchoolSelector = () => {
        setSection("home")
        setStoreType("school")
    }

    const handleSelectSchool = (event) => {
        setSchool(event.target.value)
    }

    return (
        <div>
            {
                storeType === "home" &&
                <Beepro />
            }
            {
                storeType === "school" &&
                <School school={school}/>
            }
            <Navbar sendData={handleSectionCallback} sendSchool={school}/>
            {
                section === "search" &&
                    <div style={{backgroundColor:"#555555", padding: 1}}>
                        <input type="text" placeholder="School name" onChange={handleSelectSchool} ></input>
                        <button onClick={() => handleSchoolSelector()} >Find</button>
                    </div>
            }
        </div>
    );
}

export default  Main;