import axios from "axios";

const api = axios.create({
  baseURL: "http://localhost:8080/api/board",
  headers: { "Content-Type": "applecation/json" },
});

export default api;
