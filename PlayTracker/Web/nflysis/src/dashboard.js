import React, {useState} from 'react';
import './App.css';
import {Link, useNavigate} from 'react-router-dom'
import Teams from "../src/components/teams"
import Quarter from "../src/components/quarters"

function Dashboard (){
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