# pyrefly: ignore [missing-import]
import pygame
import random
import sys

# Initialize Pygame
pygame.init()

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (213, 50, 80)
GREEN = (0, 255, 0)
BLUE = (50, 153, 213)
DARK_GREEN = (0, 180, 0)

# Screen dimensions
WIDTH, HEIGHT = 640, 480
GRID_SIZE = 20
GRID_WIDTH = WIDTH // GRID_SIZE
GRID_HEIGHT = HEIGHT // GRID_SIZE

# Set up display
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("🐍 Snake Game by Grok")
clock = pygame.time.Clock()
font = pygame.font.SysFont("Arial", 35)
score_font = pygame.font.SysFont("Arial", 25)

def draw_grid():
    for x in range(0, WIDTH, GRID_SIZE):
        pygame.draw.line(screen, (40, 40, 40), (x, 0), (x, HEIGHT))
    for y in range(0, HEIGHT, GRID_SIZE):
        pygame.draw.line(screen, (40, 40, 40), (0, y), (WIDTH, y))

def game_loop():
    # Starting position
    snake = [(GRID_WIDTH // 2, GRID_HEIGHT // 2)]
    direction = (1, 0)  # right
    next_direction = direction
    
    # Food
    food = (random.randint(0, GRID_WIDTH-1), random.randint(0, GRID_HEIGHT-1))
    
    score = 0
    speed = 10  # frames per second
    
    running = True
    game_over = False
    
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()
                
            if event.type == pygame.KEYDOWN:
                if game_over:
                    if event.key == pygame.K_r:
                        return game_loop()  # restart
                else:
                    if event.key == pygame.K_UP and direction != (0, 1):
                        next_direction = (0, -1)
                    elif event.key == pygame.K_DOWN and direction != (0, -1):
                        next_direction = (0, 1)
                    elif event.key == pygame.K_LEFT and direction != (1, 0):
                        next_direction = (-1, 0)
                    elif event.key == pygame.K_RIGHT and direction != (-1, 0):
                        next_direction = (1, 0)
        
        if game_over:
            screen.fill(BLACK)
            game_over_text = font.render("GAME OVER", True, RED)
            score_text = font.render(f"Score: {score}", True, WHITE)
            restart_text = score_font.render("Press R to Restart", True, WHITE)
            
            screen.blit(game_over_text, (WIDTH//2 - game_over_text.get_width()//2, HEIGHT//2 - 80))
            screen.blit(score_text, (WIDTH//2 - score_text.get_width()//2, HEIGHT//2 - 20))
            screen.blit(restart_text, (WIDTH//2 - restart_text.get_width()//2, HEIGHT//2 + 40))
            pygame.display.update()
            continue
        
        # Update direction
        direction = next_direction
        
        # Move snake
        head = snake[0]
        new_head = ((head[0] + direction[0]) % GRID_WIDTH, (head[1] + direction[1]) % GRID_HEIGHT)
        
        # Check collision with self
        if new_head in snake:
            game_over = True
            continue
            
        snake.insert(0, new_head)
        
        # Check if ate food
        if new_head == food:
            score += 10
            food = (random.randint(0, GRID_WIDTH-1), random.randint(0, GRID_HEIGHT-1))
            # Increase speed every 50 points
            if score % 50 == 0 and speed < 20:
                speed += 2
        else:
            snake.pop()
        
        # Draw everything
        screen.fill(BLACK)
        draw_grid()
        
        # Draw snake
        for i, segment in enumerate(snake):
            color = DARK_GREEN if i == 0 else GREEN
            pygame.draw.rect(screen, color, 
                           (segment[0] * GRID_SIZE, segment[1] * GRID_SIZE, GRID_SIZE, GRID_SIZE))
            # Add eyes to head
            if i == 0:
                eye_size = GRID_SIZE // 5
                if direction == (1, 0):   # right
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 14, segment[1]*GRID_SIZE + 7), eye_size)
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 14, segment[1]*GRID_SIZE + 13), eye_size)
                elif direction == (-1, 0): # left
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 6, segment[1]*GRID_SIZE + 7), eye_size)
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 6, segment[1]*GRID_SIZE + 13), eye_size)
                elif direction == (0, -1): # up
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 7, segment[1]*GRID_SIZE + 6), eye_size)
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 13, segment[1]*GRID_SIZE + 6), eye_size)
                elif direction == (0, 1):  # down
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 7, segment[1]*GRID_SIZE + 14), eye_size)
                    pygame.draw.circle(screen, WHITE, (segment[0]*GRID_SIZE + 13, segment[1]*GRID_SIZE + 14), eye_size)
        
        # Draw food
        pygame.draw.rect(screen, RED, 
                        (food[0] * GRID_SIZE + 2, food[1] * GRID_SIZE + 2, GRID_SIZE - 4, GRID_SIZE - 4))
        
        # Score
        score_text = score_font.render(f"Score: {score}", True, WHITE)
        screen.blit(score_text, (10, 10))
        
        pygame.display.update()
        clock.tick(speed)

    pygame.quit()

if __name__ == "__main__":
    print("🐍 Welcome to Snake Game!")
    print("Use arrow keys to move")
    print("Eat the red food to grow!")
    game_loop()