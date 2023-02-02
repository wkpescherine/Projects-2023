import React, {useState} from 'react';
import './App.css';
import {Link, useNavigate} from 'react-router-dom'
import Teams from "../src/components/teams"
import Quarter from "../src/components/quarters"
import Time from "../src/components/setTime"

function Dashboard (){
    const [homeTeam, setHomeTeam] = useState("None")
    const [awayTeam, setAwayTeam] = useState("None")
    const [quarter, setQuarter] = useState("None")
    const [time, setTime] = useState("None")
    let navigate = useNavigate();
    
    function RedirectTo(){
        navigate('/')
    }

    return (
        <div >
            <div style={{display: "flex",justifyContent: "center"}}>
                <div>
                    <Teams />
                </div>
            </div>
            <div style={{display: "flex",justifyContent: "center", margin:5,}}>
                <div>
                    <Quarter />
                </div>
                <div style={{marginLeft: 5,}}>
                    <Time />
                </div>
            </div>
            <p>
                <button onClick={RedirectTo}>LogOut</button> 
                <button>Offesnive Analysis</button>
                <button>Defensive Analysis</button>
            </p>
        </div>
    );
}

export default Dashboard;