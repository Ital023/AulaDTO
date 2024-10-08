import CardDTO from "../../../components/CardDTO";

export default function DTO() {
  return (
    <main className="max-w-[1240px] container mx-auto py-10">
      <div className="grid grid-cols-3 justify-items-center gap-y-10">
        <CardDTO />
        <CardDTO />
        <CardDTO />
        <CardDTO />
      </div>
    </main>
  );
}
