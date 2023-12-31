import { writable, get } from "svelte/store";

export const portfolioStore = writable<string[]>([]);
export const currentMenu = writable<string>("home");
export const Authentication = writable<boolean>(false);

export const portfolioStoreUpdate = async (data: App.PageData) => {
  try {
    const portfolioData = await data;
    if (portfolioData !== null || undefined) {
      portfolioStore.update(store => {
        store = data;
        return store;
      });
    }
  } catch (error) {
    if (error) {
      console.log("something went wrong in portfolio update");
      console.log(error);
    }
  }
};

export const goto = (url: string) => (window.location.href = url);

export const Authenticate = (value: boolean) => {
  Authentication.set(value);
};
