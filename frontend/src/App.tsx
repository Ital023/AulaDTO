import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import Home from "./routes/Home";
import HomeBody from "./routes/Home/HomeBody";
import MinDTO from "./routes/Home/MinDTO";
import DTO from "./routes/Home/DTO";

export default function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />}>
        <Route index element={<Navigate to="home" />} />
        <Route path="home" element={<HomeBody />} />
        <Route path="minDTO" element={<MinDTO />} />
        <Route path="DTO" element={<DTO />} />

      </Route>
    </Routes>
    </BrowserRouter>
  );
}
