export default function HomeBody() {
  return (
    <main className="flex flex-col justify-center items-center py-10 gap-4">
      <h1 className="text-4xl uppercase font-semibold">Bem vindo a aula de  <span className="text-blue-500">dto</span></h1>
      <h2 className="text-2xl">Aprenderemos como consumir Endpoints de Api com DTO</h2>

      <p>Assista a aula:</p>
      <iframe width="560" height="315" src="https://www.youtube.com/embed/ah06sWCILVU?si=9CkwIZOVtgcjyOG0" title="YouTube video player" frameBorder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerPolicy="strict-origin-when-cross-origin" allowFullScreen></iframe>
      <a className="underline text-blue-500" href="https://youtu.be/ah06sWCILVU" target="_blank">Acessar a aula</a>
    </main>
  );
}
