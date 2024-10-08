import axios from "axios";
import { BASE_URL } from "../utils/system";

export function findMinAll() {
    return axios.get(`${BASE_URL}/users/minDTO`)
}