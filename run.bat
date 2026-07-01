@echo off
echo ===================================================
echo   Starting Tailwind CSS v4 + Vite Dev Server...
echo ===================================================
echo.
echo Opening browser to http://localhost:5173/page2.html in 3 seconds...
timeout /t 3 /nobreak >nul
start http://localhost:5173/page2.html
npm run dev
