import React from "react";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Navigate,
} from "react-router-dom";
import { AuthProvider } from "./context/AuthContext";

import PrivateRoute from "./components/common/PrivateRoute";

const App = () => {
  return (
    <AuthProvider>
      <Router>
        <Routes>
          <Route element={<PrivateRoute />} />
        </Routes>
      </Router>
    </AuthProvider>
  );
};

export default App;
