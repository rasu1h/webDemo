import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Header from './Header'; // Убедитесь, что файл Header.jsx существует
import Product from "./Product"; // Убедитесь, что файл Product.jsx существует
import ProductDetails from "./ProductDetails"; // Импорт компонента деталей продукта
import Footer from "./Footer"; // Убедитесь, что файл Footer.jsx существует

function App() {
  return (
    <>
      <Header />
      <Router>
        <Routes>
          <Route path="/" element={<Product />} />
          <Route path="/product/:id" element={<ProductDetails />} />
        </Routes>
      </Router>
      <Footer />
    </>
  );
}

export default App;
