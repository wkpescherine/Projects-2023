import React, {useState} from 'react';
import './App.css';
import {Link, useNavigate} from 'react-router-dom'
import Teams from "../src/components/teams"

function Dashboard (){
    let navigate = useNavigate();
    
    function RedirectTo(){
        navigate('/')
    }

    return (
        <div>
            <Teams />
            <p>
                <button onClick={RedirectTo}>LogOut</button> 
                <button>Offesnive Analysis</button>
                <button>Defensive Analysis</button>
            </p>
        </div>
    );
}

export default Dashboard;