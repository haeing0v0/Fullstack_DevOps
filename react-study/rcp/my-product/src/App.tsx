import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import ProductList from "./component/ProductList";

function App() {
  return (
    <Router>
      <div className="container max-w-4xl p-10 mx-auto">
        <Routes>
          <Route path="/" element={<ProductList />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
