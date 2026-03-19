import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import BoardList from "./components/BoardList";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<BoardList />} />
        <Route path="b" />
      </Routes>
    </Router>
  );
}

export default App;
