defmodule M do
  def print do
    word = IO.gets("Enter some thing here") |> String.trim
    IO.puts "Test #{word}"
  end
end
