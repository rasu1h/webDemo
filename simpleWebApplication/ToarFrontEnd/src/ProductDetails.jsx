// ProductDetails.jsx
import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import axios from "axios";

function ProductDetails() {
    const { id } = useParams(); // Получаем ID продукта из параметров маршрута
    const [product, setProduct] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    // Функция для получения информации о конкретном продукте
    const fetchProduct = async () => {
        setLoading(true);
        try {
            const response = await axios.get(`http://localhost:8080/api/products/${id}`);
            setProduct(response.data);
        } catch (error) {
            setError("Не удалось загрузить информацию о продукте");
        } finally {
            setLoading(false);
        }
    };

    useEffect(() => {
        fetchProduct(); // Запрашиваем данные при загрузке страницы
    }, [id]);

    if (loading) {
        return <p>Загрузка...</p>;
    }

    if (error) {
        return <p>{error}</p>;
    }

    return (
        <div>
            {product ? (
                <div>
                    <h2>{product.name}</h2>
                    <p>{product.description}</p>
                    <p>Цена: {product.price}</p>
                </div>
            ) : (
                <p>Продукт не найден</p>
            )}
        </div>
    );
}

export default ProductDetails; // Убедитесь, что экспорт по умолчанию присутствует
