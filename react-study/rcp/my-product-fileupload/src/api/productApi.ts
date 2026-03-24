import axios from "axios";
import type { ProductDTO } from "../types/Product";

const instance = axios.create({
  baseURL: "http://localhost:8080/api/product",
  headers: { "Content-Type": "application/json" },
});

export const productApi = {
  getList: () => instance.get<ProductDTO[]>("/list").then((res) => res.data),

  getDetail: (num: number) =>
    instance.get<ProductDTO>(`/detail/${num}`).then((res) => res.data),

  insert: (product: ProductDTO) => instance.post("/insert", product),

  update: (formData: FormData) =>
    instance.post("/update", formData, {
      headers: { "Content-Type": "multipart/form-data" },
    }),

  delete: (num: number) => instance.delete(`/${num}`),
};
