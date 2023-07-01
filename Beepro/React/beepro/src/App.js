import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'

import Main from "./components/views/main"
import Home from "./components/views/home"

function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route exact path="/" element={ <Main />} />
          <Route exact path="/home" element={ <Home />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
